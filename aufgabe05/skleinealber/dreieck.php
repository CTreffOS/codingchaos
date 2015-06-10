<?php
  $a = $argv[1];
  $b = $argv[2];
  $c = $argv[3];
  $ar = array($a,$b,$c);
  arsort($ar);
  $max=$ar[0]*$ar[0];
  $rest=($ar[1]*$ar[1])+($ar[2]*$ar[2]);
  $typ;
  if(($ar[1]+$ar[2])==$ar[0]){
    $typ=0;
  }
  elseif($rest==$max){
    $typ=2;
  } elseif ($rest>$max){
    $typ=1;
  } elseif ($rest<$max){
    $typ=3;
  }
  echo "Der Typ des Dreiecks ist : $typ!\”";
?>