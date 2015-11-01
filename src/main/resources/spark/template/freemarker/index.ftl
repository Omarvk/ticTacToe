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
	<form action="/name" method="post" class="form-inline" role="form">
		Name: <input type="text" name="getName"><br>
		<button type="submit" value="Submit">Submit</button>
	</form>
	<p>
		<div id="fullname" class="alert alert-success">${name}</div>
	</p>
	<script>
	$(document).ready(function() {
		var form = $('form');
		form.submit(function( event ) {
			$.ajax({
				type: form.attr('method'),
				url: form.attr('action'),
				data: getName  
			}).done(function(name) {
				$('#name').html(name).attr('class', 'alert alert-success');
			}).fail(function() {
				$('#name').html('Villa: Magabelti').attr('class', 'alert alert-danger');
			});
			event.preventDefault();
		});
	});
	</script>
	</body>
</html>

