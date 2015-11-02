<!DOCTYPE html>
<html>
	<head>
		<title>Tic Tac Toe - Test</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	</head>
	<body>
	<p>
		Lorem ipsum tralala magabelti.
	</p>
	
	
	<textarea rows="3" style="width: 100%; max-width: 100%;" id="getName" name="getName"></textarea>
	<button type="submit" id="setName">Submit</button>
	
	<p>
		<div id="fullname" class="alert alert-success">${name}</div>
	</p>
	<script>
	$(document).ready(function() {
		$("#setName").click(function()
		{
			var gName = $("#getName").val();
			$.post("/name",{getName: gName});
			$(location).attr('href', "/");  
		});
	});
	</script>
	</body>
</html>

