<?php 
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "job";
         
    $conn = mysqli_connect($servername, $username, $password, $dbname);
         
    if (mysqli_connect_error()) {
      die("Connection failed: " . mysqli_connect_error());
    }

	if(isset($_POST['btnpostad'])){
		
		$logo = $_POST['logo'];
		$companyname = $_POST['coname'];
		$location = $_POST['location'];
		$contact = $_POST['contactno'];
		$salary = $_POST['salary'];
		$qualification = $_POST['qualification'];
		$gender = $_POST['gender'];
		$description = $_POST['jobdescrip'];
		$jobtype = $_POST['type'];	
			
		$sql = "INSERT INTO job_item VALUES ('','$logo','$companyname','$location','$contact','$salary','$qualification','$gender','$description','$jobtype')";
     
		$result = mysqli_query($conn,$sql);
     
		if ($result) {
			echo "<script>
						alert('You Advertisement Posted Successfully..');
				  </script>";
			echo "<script>window.location = 'jobitem.php'</script>";
		} else {
			echo "Error: " . $sql . "<br>" . mysqli_error($conn);
		}
	}

    mysqli_close($conn);
?>

<html>
<head>
	<title>Post Advertisements</title>
	<link rel = "stylesheet" href = "style.css">
</head>
<body>
	<table class = "topic">
		<tr>
			<th class = "topicsub1"><img src = "images/TJS logo.png" width = "280px" height = "60px"></th>
			<th class = "topicsub2">Top Jobs Sri Lanka</th>
		</tr>
	</table>
	<table class = 'header1'>
		<tr>
			<th><a href = "jobitem.php" class = "a1">HOME</a></th>
			<th><a href = "post_advertisements.php" class = "a1">POST ADVERTISEMENTS</a></th>
			<th><a href = "about_us.html" class = "a1">ABOUT US</a></th>
			<th><a href = "contact_us.php" class = "a1">CONTACT US</a></th>
			<th class = "span1"><a href = "home.php" class = "a1">LOGOUT</a></th>
		</tr>
	</table>
	<div>
		<h1 class = "header2">Post Your Advertisements</h1>
		<form action = "post_advertisements.php" method = "POST" class = "bkground_postad">
			<table border = "0" class = "form2">
			
				<tr>
					<td class = "space" id = "txt_postad">Company Logo </td> 
					<td class = "space"><input type="file" name="logo"> <span style = "color: white
					;">Formats:&nbsp;.png,.jpg,.jpeg</span></td>
				</tr>
				<tr>
					<td class = "space" id = "txt_postad">Company Name </td> 
					<td class = "space"><input type = "text" onfocus="this.value=''" name = "coname" placeholder = "Company Name" class = "input-group3" required/></td>
				</tr>
				<tr>
					<td class = "space" id = "txt_postad">Location </td> 
					<td class = "space"><input type = "text" onfocus="this.value=''" name = "location" placeholder = "Location" class = "input-group3" required/></td>
				</tr>
				<tr>
					<td class = "space" id = "txt_postad">Contact No </td> 
					<td class = "space"><input type = "text" onfocus="this.value=''" name = "contactno" placeholder = "Contact No" class = "input-group3" required/></td>
				</tr>
				<tr>
					<td class = "space" id = "txt_postad">Salary </td> 
					<td class = "space"><input type = "text" onfocus="this.value=''" name = "salary" placeholder = "Salary" class = "input-group3" required/></td>
				</tr>
				<tr>
					<td class = "space" id = "txt_postad">Qualification / Work Experience </td> 
					<td class = "space"><input type = "text" onfocus="this.value=''" name = "qualification" placeholder = "Qualification / Work Experience" class = "input-group3" required/></td>
				</tr>
				<tr>
					<td class = "space" id = "txt_postad">Prefered Sex </td> 
					<td class = "space"><input type="radio" name="gender" value="Male" required/> Male
										<input type="radio" name="gender" value="Female" required/> Female
										<input type="radio" name="gender" value="Male / Female" required/> Male / Female
					</td>
				</tr>
				<tr>
					<td class = "space" id = "txt_postad">Job Description </td> 
					<td class = "space"><input type = "text" onfocus="this.value=''" name = "jobdescrip" placeholder = "Job Description" class = "input-group3" required/></td>
				</tr>
				<tr>
					<td class = "space" id = "txt_postad">Job Type </td> 
					<td class = "space"><select name="type" class = "input-group3">
											<option value=""> </option>
											<option value="Full Time">Full Time</option>
											<option value="Part Time">Part Time</option>
											<option value="Full Time / Part Time">Full Time / Part Time</option>											
										</select>
					</td>
				</tr>
				<tr>
					<td colspan = "2"><input type = "submit" value = "Submit" name = "btnpostad" class = "btnpostad" /></td>
				</tr>
			</table>
		</form>
	</div>
	<div>
		<footer>Designed and Developed By: Rashmika Copyright &copy; 2022. <small>All Rights Reserved.</small></footer>
	</div>	
</body>
</html>