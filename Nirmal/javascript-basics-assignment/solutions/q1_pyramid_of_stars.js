/* Write a program to build a `Pyramid of stars` of given height */

const buildPyramid = (rows) => {
     let string ="";
      for (let i = 1; i <=rows; i++) {
          let spaces = " ".repeat((rows+1)-i)
          let stars ="* ".repeat(i)
          string += (spaces + stars + " \n")
      }
      return string;
     };

/* For example,
INPUT - buildPyramid(6)
OUTPUT -
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

*/

module.exports = buildPyramid
