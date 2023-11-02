package com.nirm.CollectionDI;

import java.util.List;
import java.util.Set;

public class CollectionCl {
	
	List<Skill> skillList;
	Set<Skill> skillSet;
	
	public CollectionCl(List<Skill> skillList, Set<Skill> skillSet) {
		this.skillList = skillList;
		this.skillSet = skillSet;
	}
	public List<Skill> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}
	public Set<Skill> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(Set<Skill> skillSet) {
		this.skillSet = skillSet;
	}
}