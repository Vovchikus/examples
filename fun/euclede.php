<?php

/**
 * @param int $m
 * @param int $n
 * @return int
 */
function calculate($m, $n){
  $b = $m;
  $l = $n;
  if($n > $m){
    $b = $n;
    $l = $m;
  }
  $r = $b % $l;
  while($r != 0){
    $b = $l;
    $l = $r;
    $r = $b % $l;
  }
  return $l;
}

print calculate(544, 119);