<?php

namespace Pattern;

/**
 * Class Call
 */
class Call
{

  /**
   * @var int
   */
  private $requestQuantity;

  /**
   * Call constructor.
   * @param int $calls
   */
  public function __construct($calls = 75)
  {
    $this->requestQuantity = $calls;
  }

  /**
   * @return int
   */
  public function getRequestQuantity()
  {
    return $this->requestQuantity;
  }

  /**
   * @param $quantity
   * @return $this
   */
  public function setRequestQuantity($quantity)
  {
    $this->requestQuantity = $quantity;
    return $this;
  }

}