function largestOfThree(num1, num2, num3) {
  if (num1 > num2 && num1 > num3) {
    console.log("The largest of three number is " + num1);
  } else if (num2 > num3 && num2 > num1) {
    console.log("The largest of three number is " + num2);
  } else {
    console.log("The largest of three number is " + num3);
  }
}

  largestOfThree(99, 85, 74);
  largestOfThree(85, 35, 72);
  largestOfThree(93, 57, 39);

function smallestOfThree(num1, num2, num3) {
  if (num1 < num2 && num1 < num3) {
    console.log("The smallest of three number is " + num1);
  } else if (num2 < num3 && num2 < num1) {
    console.log("The smallest of three number is " + num2);
  } else {
    console.log("The smallest of three number is " + num3);
  }
}

smallestOfThree(67, 83, 75);
smallestOfThree(63, 86, 35);
smallestOfThree(83, 29, 49);
