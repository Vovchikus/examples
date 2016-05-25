<?php

$array = [2, 5, 1, 3, 1, 2, 1, 7, 7, 6];

/**
 * @param array $array
 * @return int
 */
function calculate(array $array)
{
  $leftMax = 0;
  $rightMax = 0;

  $leftIndex = 0;
  $rightIndex = count($array) - 1;
  $volume = 0;
  while($leftIndex < $rightIndex){
    if($array[$leftIndex] > $leftMax){
      $leftMax = $array[$leftIndex];
    }
    if($array[$rightIndex] > $rightMax){
      $rightMax = $array[$rightIndex];
    }
    if($leftMax >= $rightMax){
      $volume += $rightMax - $array[$rightIndex];
      $rightIndex --;
    }
    else{
      $volume += $leftMax - $array[$leftIndex];
      $leftIndex ++;
    }
  }
  return $volume;
}