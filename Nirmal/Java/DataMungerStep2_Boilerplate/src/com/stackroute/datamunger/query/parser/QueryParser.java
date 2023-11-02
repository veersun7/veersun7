package com.stackroute.datamunger.query.parser;

/*There are total 4 DataMungerTest file:
 * 
 * 1)DataMungerTestTask1.java file is for testing following 4 methods
 * a)getBaseQuery()  b)getFileName()  c)getOrderByClause()  d)getGroupByFields()
 * 
 * Once you implement the above 4 methods,run DataMungerTestTask1.java
 * 
 * 2)DataMungerTestTask2.java file is for testing following 2 methods
 * a)getFields() b) getAggregateFunctions()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask2.java
 * 
 * 3)DataMungerTestTask3.java file is for testing following 2 methods
 * a)getRestrictions()  b)getLogicalOperators()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask3.java
 * 
 * Once you implement all the methods run DataMungerTest.java.This test case consist of all
 * the test cases together.
 */

import java.util.*;

public class QueryParser {

	private QueryParameter queryParameter = new QueryParameter();

	/*
	 * This method will parse the queryString and will return the object of
	 * QueryParameter class
	 */
	public QueryParameter parseQuery(String queryString) {

		queryParameter.setFileName(getFileName(queryString));
		queryParameter.setBaseQuery(getBaseQuery(queryString));
		queryParameter.setOrderByFields(getOrderByFields(queryString));
		queryParameter.setGroupByFields(getGroupByFields(queryString));
		queryParameter.setFields(getFields(queryString));
		queryParameter.setAggregateFunctions(getAggregateFunctions(queryString));
		queryParameter.setRestrictions(getConditions(queryString));
		queryParameter.setLogicalOperators(getLogicalOperators(queryString));

		return queryParameter;
	}

	/*
	 * Extract the name of the file from the query. File name can be found after the
	 * "from" clause.
	 */

	public String getFileName(String queryString){
		return (queryString.substring(queryString.indexOf("from") + 5 , queryString.indexOf("csv") + 3));
	}

	/*
	 * 
	 * Extract the baseQuery from the query.This method is used to extract the
	 * baseQuery from the query string. BaseQuery contains from the beginning of the
	 * query till the where clause
	 */

	public String getBaseQuery(String queryString) {
		return (queryString.substring(0 , queryString.indexOf("csv")+3));
	}

	/*
	 * extract the order by fields from the query string. Please note that we will
	 * need to extract the field(s) after "order by" clause in the query, if at all
	 * the order by clause exists. For eg: select city,winner,team1,team2 from
	 * data/ipl.csv order by city from the query mentioned above, we need to extract
	 * "city". Please note that we can have more than one order by fields.
	 */

	public List<String> getOrderByFields(String queryString) {

		if(queryString.indexOf("order by") == -1)
			return null;

		int startIndex = queryString.indexOf("order by") + 9;
		int endIndex = queryString.length();

		String[] tempStore =  queryString.substring(startIndex, endIndex).toLowerCase().split(" ");
		List<String> orderByFields = new ArrayList<String>(Arrays.asList(tempStore));

		return orderByFields;
	}

	/*
	 * Extract the group by fields from the query string. Please note that we will
	 * need to extract the field(s) after "group by" clause in the query, if at all
	 * the group by clause exists. For eg: select city,max(win_by_runs) from
	 * data/ipl.csv group by city from the query mentioned above, we need to extract
	 * "city". Please note that we can have more than one group by fields.
	 */

	public List<String> getGroupByFields(String queryString) {

		if(queryString.indexOf("group by") == -1)
			return null;

		int startIndex = queryString.indexOf("group by") + 9;
		int endIndex;

		if (queryString.substring(startIndex).contains("order by"))
			endIndex = queryString.indexOf("order") - 1;
		else
			endIndex = queryString.length();

		String[] tempStore =  queryString.substring(startIndex, endIndex).toLowerCase().split(" ");
		List<String> groupByFields = new ArrayList<String>(Arrays.asList(tempStore));

		return groupByFields;
	}

	/*
	 * Extract the selected fields from the query string. Please note that we will
	 * need to extract the field(s) after "select" clause followed by a space from
	 * the query string. For eg: select city,win_by_runs from data/ipl.csv from the
	 * query mentioned above, we need to extract "city" and "win_by_runs". Please
	 * note that we might have a field containing name "from_date" or "from_hrs".
	 * Hence, consider this while parsing.
	 */

	public List<String> getFields(String queryString) {

		int startIndex = queryString.indexOf("select") + 7;
		int endIndex = queryString.indexOf("from") - 1;

		String[] tempStore = queryString.substring(startIndex, endIndex).split(",");
		List<String> fields = new ArrayList<String>(Arrays.asList(tempStore));

		return fields;
	}

	/*
	 * Extract the conditions from the query string(if exists). for each condition,
	 * we need to capture the following: 1. Name of field 2. condition 3. value
	 * 
	 * For eg: select city,winner,team1,team2,player_of_match from data/ipl.csv
	 * where season >= 2008 or toss_decision != bat
	 * 
	 * here, for the first condition, "season>=2008" we need to capture: 1. Name of
	 * field: season 2. condition: >= 3. value: 2008
	 * 
	 * the query might contain multiple conditions separated by OR/AND operators.
	 * Please consider this while parsing the conditions.
	 * 
	 */

	public List<Restriction> getConditions(String queryString) {

		if(!queryString.contains("where"))
			return null;

		queryString = queryString.replace(" and ",",");
		queryString = queryString.replace(" or ",",");
		queryString = queryString.replace("'","");

		int startIndex = queryString.indexOf("where")+6;
		int endIndex;

		if(queryString.contains("group"))
			endIndex = queryString.indexOf("group")-1;
		else if(queryString.contains("order"))
			endIndex = queryString.indexOf("order")-1;
		else
			endIndex = queryString.length();

		String[] result = queryString.substring(startIndex, endIndex).split(",");
		List<Restriction> restrictions = new ArrayList<>();

		for(String s:result){
			String[] array = s.trim().split("<|>|=");
			if(s.contains("="))
				restrictions.add(new Restriction(array[0].trim(),array[1].trim(),"="));
			else if(s.contains(">"))
				restrictions.add(new Restriction(array[0].trim(),array[1].trim(),">"));
			else
				restrictions.add(new Restriction(array[0].trim(),array[1].trim(),"<"));
		}

		return restrictions;
	}


	/*
	 * Extract the logical operators(AND/OR) from the query, if at all it is
	 * present. For eg: select city,winner,team1,team2,player_of_match from
	 * data/ipl.csv where season >= 2008 or toss_decision != bat and city =
	 * bangalore
	 * 
	 * The query mentioned above in the example should return a List of Strings
	 * containing [or,and]
	 */

	public List<String> getLogicalOperators(String queryString) {

		String[] queryArray = queryString.split(" ");
		int count = 0, index = 0;

		for(String str:queryArray) {
			if(str.equals("and") || str.equals("or"))
				count++;
		}

		if(count == 0) return null;

		String[] result = new String[count];

		for(int i=0; i<queryArray.length; i++){
			if(queryArray[i].equals("and") || queryArray[i].equals("or")){
				result[index] = queryArray[i];
				index++;
			}
		}

		List<String> logicalOperators = new ArrayList<String>(Arrays.asList(result));

		return logicalOperators;
	}

	/*
	 * Extract the aggregate functions from the query. The presence of the aggregate
	 * functions can determined if we have either "min" or "max" or "sum" or "count"
	 * or "avg" followed by opening braces"(" after "select" clause in the query
	 * string. in case it is present, then we will have to extract the same. For
	 * each aggregate functions, we need to know the following: 1. type of aggregate
	 * function(min/max/count/sum/avg) 2. field on which the aggregate function is
	 * being applied.
	 * 
	 * Please note that more than one aggregate function can be present in a query.
	 * 
	 * 
	 */

	public List<AggregateFunction> getAggregateFunctions(String queryString) {

		queryString = queryString.replace(',',' ');
		String[] queryArray = queryString.split(" ");
		int count = 0, index = 0;

		for(String str:queryArray) {
			if(str.contains("count") || str.contains("sum") || str.contains("max") || str.contains("min") || str.contains("avg"))
				count++;
		}

		if(count == 0) return null;

		String[] result = new String[count];

		for(int i=0; i<queryArray.length; i++){
			if(queryArray[i].contains("count") || queryArray[i].contains("sum") || queryArray[i].contains("max") || queryArray[i].contains("min") || queryArray[i].contains("avg")){
				result[index] = queryArray[i];
				index++;
			}
		}

		List<AggregateFunction> aggregateFunctions = new ArrayList<>();

		for(String s:result){
			s = s.replace('(',' ');
			s = s.replace(')',' ');
			String[] sarr = s.trim().split(" ");
			aggregateFunctions.add(new AggregateFunction(sarr[1],sarr[0]));
		}
		return aggregateFunctions;
	}
}