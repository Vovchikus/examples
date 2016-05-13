<?php

namespace Pattern;

/**
 * Class Operator
 */
class Operator extends CallHandler
{
  /**
   * @var int
   */
  private $capacity;

  /**
   * Operator constructor.
   * @param int $capacity
   */
  public function __construct($capacity = 50)
  {
    $this->capacity = $capacity;
  }

  /**
   * @param Call $call
   * @return string
   */
  protected function handle(Call $call)
  {
    $handle = $call->getRequestQuantity() - $this->getCapacity();
    $call->setRequestQuantity($handle);
    return $handle > 0 ? false : true;
  }

  /**
   * @return int
   */
  protected function getCapacity()
  {
    return $this->capacity;
  }

}