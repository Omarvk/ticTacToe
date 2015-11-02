<!DOCTYPE html>
<html>
	<head>
		<title>Tic Tac Toe - Test</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="style.css">
		<link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	</head>
	<body>
	<p>
		Lorem ipsum tralala magabelti.
	</p>
	<div id="board">
		<table id="tictactoetable" class="table table-responsive table-bordered">
			<tr>
				<td id="td00">
					<img src="../graphics/empty.svg" id="i00" alt="Cell 0.0" />
				</td>
				<td id="td01">
					<img src="../graphics/empty.svg" id="i01" alt="Cell 0.1" />
				</td>
				<td id="td02">
					<img src="../graphics/empty.svg" id="i02" alt="Cell 0.2" />
				</td>
			</tr>
			<tr>
				<td id="td10">
					<img src="../graphics/empty.svg" id="i10" alt="Cell 1.0" />
				</td>
				<td id="td11">
					<img src="../graphics/empty.svg" id="i11" alt="Cell 1.1" />
				</td>
				<td id="td12">
					<img src="../graphics/empty.svg" id="i12" alt="Cell 1.2" />
				</td>
			</tr>
			<tr>
				<td id="td20">
					<img src="../graphics/empty.svg" id="i20" alt="Cell 2.0" />
				</td>
				<td id="td21">
					<img src="../graphics/empty.svg" id="i21" alt="Cell 2.1" />
				</td>
				<td id="td22">
					<img src="../graphics/empty.svg" id="i22" alt="Cell 2.2" />
				</td>
			</tr>
		</table>
	</div>
	<script>
			$('img').click(function(){
					  //var col = $(this).parent().children().index($(this));
					  		  //var row = $(this).parent().parent().children().index($(this).parent());
							  					
				$(this).attr("src", "../graphics/red_x.svg");
														  //$(this).attr("src", "../graphics/blue_circle.svg");
			});
	</script>
	</body>
</html>


