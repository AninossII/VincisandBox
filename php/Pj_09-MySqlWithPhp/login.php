<?php //login
$host = "localhost";
$data = "mysql";
$user = "root";
$pass = "1234";
$chrs = "utf8mb4";
$attr = "mysql:host=$host;dbname=$data;charset=$chars";
$opts = [
    PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
    PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
    PDO::ATTR_EMULATE_PREPARES => false,
];
