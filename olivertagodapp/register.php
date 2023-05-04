<?php

    $con = mysqli_connect("localhost","id20700382_myapps","=4m71IT[W>u>[+8=","id20700382_ogtagodapps");

    $fullname = $_POST['fullname'];
    $email = $_POST['email'];
    $password = $_POST['password'];

    $sql = "INSERT INTO finalapp(fullname, email, password) VALUES ('fname','lname','email','password')";
    $result = mysqli_query($con, $sql);

    if($result){
        echo "registered successfully";
    } else {
        echo "error occured!";
    }
?>