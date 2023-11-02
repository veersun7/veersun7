/* Write a Program to Flatten a given n-dimensional array */


const flatten = (myarr) => {
	if (Array.isArray(myarr)) {
		let x = myarr.length;
		let array_flat = myarr.flat(x);
		return array_flat;
	  } else {
		return null;
	  }
	  };

module.exports = flatten

/* For example,
INPUT - flatten([1, [2, 3], [[4], [5]])
OUTPUT - [ 1, 2, 3, 4, 5 ]

*/

