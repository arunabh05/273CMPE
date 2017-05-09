/**
 * 
 */

var tFarheneit = window.prompt("Enter Temperature in Fahreheit");

window.document.getElementById("inF").innerHTML = tFarheneit;

// To convert Farheneit to Celsius
function toCelsius(tFarheneit) {
	var tCelsius = (tFarheneit - 32) * 5 / 9;
	window.console.log(tFarheneit);
	window.console.log(tCelsius);
	window.document.getElementById("inC").innerHTML = tCelsius;
}

// To convert Farheneit to Kelvin
function toKelvin(tFarheneit) {
	var tKelvin = (tFarheneit - 32) * 5 / 9 + 273.5;
	window.console.log(tFarheneit);
	window.console.log(tKelvin);
	window.document.getElementById("inK").innerHTML = tKelvin;
}