<?php

$con = mysqli_connect("localhost", "id20700382_myapps", "=4m71IT[W>u>[+8=", "id20700382_ogtagodapps");

$email = $_POST['email'];
$password = $_POST['password'];

$stmt = mysqli_prepare($con, "SELECT * FROM finalapp WHERE email = ? AND password = ?");
mysqli_stmt_bind_param($stmt, "ss", $email, $password);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);

if ($result->num_rows > 0) {
    echo "success";
} else {
    echo "failure";
}

mysqli_stmt_close($stmt);
mysqli_close($con);
?>
