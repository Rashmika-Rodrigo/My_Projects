<?php 
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "job";
         
    $conn = mysqli_connect($servername, $username, $password, $dbname);
         
    if (mysqli_connect_error()) {
      die("Connection failed: " . mysqli_connect_error());
    }	
	
	if (isset($_POST['btnregister'])){
		
		$fname = $_POST['fname'];
		$lname = $_POST['lname'];
		$email = $_POST['email'];
		$uname = $_POST['uname'];
		$pass = $_POST['pass'];
		$cpass = $_POST['cpass'];
		
		
		$sql1 = "SELECT * FROM new_registration WHERE Username = '$uname' "; 
		$result1 = mysqli_query($conn,$sql1);
		
		if(mysqli_num_rows($result1) > 0){
				while($row = mysqli_fetch_array($result1)){		//Checking if the Username is already exist..
				echo "<script>
						alert('The Username Already Exists.. Please Try Another');
					</script>";
				}
        
		}
		else if ($pass <> $cpass){
				echo "<script>
						alert('Password is Not Matching');
					</script>";
		}
		else{ 
			
			$sql = "INSERT INTO new_registration VALUES ('$fname','$lname','$email','$uname', '$pass', '$cpass')";
     
			$result = mysqli_query($conn,$sql);
     
				if ($result) {
						
						echo "<script>
								alert('Your Account Created Successfully..');
							  </script>";
						echo "<script>
								window.location = 'home.php'
							  </script>";
				} else {
						echo "Error: " . $sql . "<br>" . mysqli_error($conn);
				}
			}
		}

    mysqli_close($conn);
?>

<html>

    <head>
		<title>Registration Form</title>
		<link rel = "stylesheet" href = "style.css">
    </head>
	
    <body class = "bkground_new_user_pg">
	
		<div class = "register_form">
			<h1 class = "h1">Registration Form</h1>
			<form action = "new_user_registration.php" method = "POST">
				<table border = "0">
					<tr>
						<td class = "space">First Name</td> 
						<td class = "space"><input type = "text" onfocus="this.value=''" name = "fname"  placeholder = "First Name" class = "input-group" required/></td>
					</tr>
					<tr>
						<td class = "space">Last Name</td>
						<td class = "space"><input type = "text" onfocus="this.value=''" name = "lname"  placeholder = "Last Name" class = "input-group" required/></td>
					</tr>
					<tr>
						<td class = "space">Email</td>
						<td class = "space"><input type = "text" onfocus="this.value=''" name = "email"  placeholder = "Email" class = "input-group" required/></td>
					</tr>
					<tr>
						<td class = "space">Username</td>
						<td class = "space"><input type = "text" onfocus="this.value=''" name = "uname"  placeholder = "Username" class = "input-group" required/></td>
					</tr>
					<tr>
						<td class = "space">Password</td>
						<td class = "space"><input type = "password" onfocus="this.value=''" name = "pass" placeholder = "Password" class = "input-group" required/></td>
					</tr>
					<tr>
						<td class = "space">Confirm Password</td>
						<td class = "space"><input type = "password" onfocus="this.value=''" name = "cpass"  placeholder = "Confirm Password" class = "input-group" required/></td>
					</tr>
					<tr>
						<td colspan = "2"><input type = "submit" value = "Create Account"  name = "btnregister" class = "btnregister" /></td>
					</tr>
					<tr>
						<td colspan = "2" class = "space2"><a href = "home.php">Back</a></td>
					</tr>
				</table>
			</form>
		<div>
    </body>
</html>