<?php

    $con = mysqli_connect("localhost","id20700382_myapps","=4m71IT[W>u>[+8=","id20700382_ogtagodapps");

    $email = $_POST['email'];
    $password = $_POST['password'];

    $sql = "SELECT * FROM finalapp WHERE email = '$email' AND password = '$password'";
    $result = mysqli_query($con, $sql);

    if($result->num_rows > 0){
        echo "logged in successfully";
    } else {
        echo "user not found";
    }

?>