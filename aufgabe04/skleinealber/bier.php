<?php
  $geld = $argv[1];
  $bier = $argv[2];
  $anz = $geld/$bier;
  $pyr=0;
  $i=1;
  intval($anz);
  while($anz>=$pyr){
    $pyr += ($i*$i);$i++;
  }
  $i-=2;
  echo "Anzahl der Pyramiden-Ebenen : $i!\n";
?>