//declaring Strict Mode
"use strict"

var pi = 3.14;

//
function calc(){
	var r = document.getElementById("t1").value;
	
	var area = pi*r*r;
	
	document.getElementById("res").innerHTML = "Area of the circle with radius "+r+" is "+area;
}