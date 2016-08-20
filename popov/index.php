<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        error_reporting(E_ALL);

    $host = 'localhost';
    $user = 'root';
    $password = 'top';
    $database = 'firstdb';
        
    $link = mysqli_connect($host, $user, $password, $database) 
            or die('( ' . mysqli_connect_errno() . ' ) ' 
            . mysqli_connect_error());
    
    
    $query = 'SELECT * FROM employees';   
    
    
    
    
   
        
    if($result =  mysqli_query($link, $query)) {
        
        while ($row = mysqli_fetch_assoc($result)) {
            printf("%s %s |\n", $row["name"], $row[lastname] );
        }
        mysqli_free_result($result);
    }
    
    
    
        ?>
    </body>
</html>























































