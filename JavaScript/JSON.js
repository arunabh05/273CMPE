var Sch = 
  [ {
      "Course":"CMPE 202",
      "Days":"Sat",
      "Time":"9 AM",
      "Professor":"CMPE202 - P1"
   },
   {
      "Course":"CMPE 202",
      "Days":"Sat",
      "Time":"12 AM",
      "Professor":"CMPE 202 - P1"
   },
   {
      "Course":"CMPE 272",
      "Days":"Mon",
      "Time":"6 PM",
      "Professor":"CMPE272 - P1"
   },
   {
      "Course":"CMPE 272",
      "Days":"Sat",
      "Time":"9 AM",
      "Professor":"CMPE272 - P2"
   },
   {
      "Course":"CMPE 273",
      "Days":"Mon, Wed",
      "Time":"4:30 PM",
      "Professor":"CMPE273 - P1"
   },
   {
      "Course":"CMPE 273",
      "Days":"Sun",
      "Time":"6 PM",
      "Professor":"CMPE273 - P2"
   }
 
 ];


var res = "<br/><hr><br/>Course Name -- Day of Class -- Time -- Professor<br/><hr><br/>";
// Displaying data From JSON
for (i = 0; i < 6; i++) {
	{
		res = res + "<br>" + Sch[i].Course + " -- " + Sch[i].Days + " -- "
				+ Sch[i].Time + " -- " + Sch[i].Professor;
	}

	console.log(res);
	document.getElementById("a1").innerHTML = res;
}

// Alert on my class days Mon, Wed, Sat
var date = new Date();
var d = date.getDay();
console.log(date.getDay());

if (d == 1 || d == 3 || d == 7) {
	window.alert("You have a class today");
}
