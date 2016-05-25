<?php

/**
 * @param array $list
 * @param int $val
 * @return int
 */
function binary_search($list, $val)
{
  $right = 0;
  $left = count($list) - 1;

  while ($right <= $left) {
    $mid = ($right + $left) >> 1;
    $mid_val = $list[$mid];
    if ($mid_val < $val) {
      $right = $mid + 1;
    } elseif ($mid_val > $val) {
      $left = $mid - 1;
    } else {
      return $mid;
    }
  }
  return -1;
}

print binary_search([1, 5, 10, 23, 46, 199], 199).PHP_EOL;