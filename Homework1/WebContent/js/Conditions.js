//To calculate the Score.
function showResults() {
	var x1 = document.getElementById("q1").selectedIndex;
	var y1 = document.getElementById("q1").options;

	var x2 = document.getElementById("q2").selectedIndex;
	var y2 = document.getElementById("q2").options;

	var x3 = document.getElementById("q3").selectedIndex;
	var y3 = document.getElementById("q3").options;

	var count = 0;
	if (y1[x1].text == "Canberra") {
		count++;
	}
	if (y2[x2].text == "Vatican City") {
		count++;
	}
	if (y3[x3].text == "Angel Falls") {
		count++;
	}
	console.log(count);
	if (count == 3) {
		window.document.getElementById("res").innerHTML = "Great!! You got all correct";
	} else if (count == 2) {
		window.document.getElementById("res").innerHTML = "Good!! You got 2 correct";
	} else if (count == 1) {
		window.document.getElementById("res").innerHTML = "Nice try!! You got 1 correct";
	} else {
		window.document.getElementById("res").innerHTML = "Better luck next time!! 0 correct answers";
	}
}
