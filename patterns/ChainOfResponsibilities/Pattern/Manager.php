<?php

namespace Pattern;

/**
 * Class Manager
 */
class Manager extends CallHandler
{

  /**
   * @var int
   */
  private $capacity;

  /**
   * Manager constructor.
   * @param int $capacity
   */
  public function __construct($capacity = 20)
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