
function logout() {
	window.location.href = "http://localhost:8080/logout";
}

document.querySelectorAll(".nav-link").forEach((link) => {
	if (link.href === window.location.href) {
		link.classList.add("active");
		link.setAttribute("aria-current", "page");
	}
});

$(document).ready(function() {
	var sPageURL = window.location.search.substring(1);
	var sURLVariables = sPageURL.split('?');
	if (sURLVariables[0] == "error") {
		$("#msg").css("display","table-row");
		$("#msg").find("td:eq(0)").html("Error: Incorrect Credentials");
		$("#msg").find("td:eq(0)").css("color","red");
		$("#msg").find("td:eq(0)").css("text-align","center");
	}
	if (sURLVariables[0] == "logout") {
		$("#msg").css("display","table-row");
		$("#msg").find("td:eq(0)").html("Info: You're Logged Out..");
		$("#msg").find("td:eq(0)").css("color","green");
		$("#msg").find("td:eq(0)").css("text-align","center");
	}
});