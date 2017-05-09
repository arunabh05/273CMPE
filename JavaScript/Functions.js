//Creating a object
var Vehicle = Object();
Vehicle.vehicleName = window.prompt("Enter the name of the vehicle:");
window.document.getElementById("vn").innerHTML = Vehicle.vehicleName;

Vehicle.fuelAmt = window.prompt("Enter the amount of fuel used:");
window.document.getElementById("fa").innerHTML = Vehicle.fuelAmt;

Vehicle.milesCov = window.prompt("Enter the miles covered:");
window.document.getElementById("mc").innerHTML = Vehicle.milesCov;

//To Calculate Mileage
function myMileage(Vehicle) {
	return Vehicle.milesCov / Vehicle.fuelAmt;
}
Vehicle.Mileage = myMileage(Vehicle);
window.document.getElementById("M").innerHTML = Vehicle.Mileage;