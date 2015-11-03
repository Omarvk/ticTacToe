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
	<div id="playarea">
		<div id="board">
			<table id="tictactoetable" class="table table-responsive table-bordered">
				<tr>
					<td id="td00">
						<div id="d00">${a00}</div>
					</td>
					<td id="td01">
						<div id="d01">${a01}</div>
					</td>
					</td>
					<td id="td02">
						<div id="d02">${a02}</div>
					</td>
				</tr>
				<tr>
					<td id="td10">
						<div id="d10">${a10}</div>
					</td>
					<td id="td11">
						<div id="d11">${a11}</div>
					</td>
					<td id="td12">
						<div id="d12">${a12}</div>
					</td>
				</tr>
				<tr>
					<td id="td20">
						<div id="d20">${a20}</div>
					</td>
					<td id="td21">
						<div id="d21">${a21}</div>
					</td>
					<td id="td22">	
						<div id="d22">${a22}</div>
					</td>
				</tr>
			</table>
		</div>
		<div id="scorearea">
			<p id="score">
				${Message}
			</p>
			<p id="score">
				Player 1: 
			</p>
			<p id="score">
				Player 2: 
			</p>
			<p>
				<button type="button" id="newGame" class="btn btn-default">New Game</button>
			</p>
		</div>
	</div>
	<script>
			$(document).ready(function() 
			{
				/*for(var x = 0; x < 3; x++)
				{ 
					for(var y = 0; y < 3; y++)
					{
						var check = $('#d'+x+''+y).html();
						if(check == 1)
						{
							$('#d'+x+''+y).html('<img src="../graphics/red_x.svg" id="i'+x+''+y+'" alt="Cell '+x+'.'+y+'" />');
						}
						else if(check == 2)
						{
				    	    $('#d'+x+''+y).html('<img src="../graphics/blue_circle.svg" id="i'+x+''+y+'" alt="Cell '+x+'.'+y+'" />');
						}	
						else
						{
				    	    $('#d'+x+''+y).html('<img src="../graphics/empty.svg" id="i'+x+''+y+'" alt="Cell '+x+'.'+y+'" />');
						}
					}
				}*/ 
				$('img').click(function(event)
				{
			   		$.post("/move", {cell: event.target.id } );
					window.location.reload();
					//location.reload();
					//$(location).attr('href',"/");
				});
				$('#newGame').click(function()
				{
					$.post("/newGame", {});
					window.location.reload();
				});

			});
			
	</script>
	</body>
</html>



