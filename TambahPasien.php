<?php

	$HostName = "localhost";
	$HostUser = "root";
	$HostPass = "";
	$DatabaseName = "dbdys";
	$con = mysqli_connect($HostName,$HostUser,$HostPass,$DatabaseName);
	
  $respon=array();
  
  if (isset($_POST['nik']) && isset($_POST['nik'])){
  $nik = $_POST['nik']
  $nama = $_POST['nama']
  
  $result = mysqli_query($con, "INSERT INTO tblpasien (nik,nama) VALUES ('$nik','$nama')");
  
  if($result){
  $respon["sukses"] = 1;
  $respon["pesan"] = "Berhasil menambah data pasien";
  
  echo json_encode($respon);
  }else{
  $respon["sukses"] = 0;
  $respon["pesan"] = "Gagal menambah data pasien ";
  
  echo json_encode($respon);
  }
  }else {
   $respon["sukses"] = 0;
   $respon["pesan"] = "Data Belum terisi";
   
   echo json_encode($respon);
   }
 ?>
