<?php

namespace Pattern;

/**
 * Class CallHandler
 */
abstract class CallHandler
{

  /**
   * @var CallHandler
   */
  protected $successor;

  /**
   * @param CallHandler $handler
   */
  final public function append(CallHandler $handler)
  {
    if ($this->successor === null) {
      $this->successor = $handler;
    } else {
      $this->successor->append($handler);
    }
  }

  /**
   * @param Call $call
   * @return mixed
   */
  final public function dispatch(Call $call)
  {
    $dispatch = $this->handle($call);
    if (!$dispatch) {
      $dispatch = $this->successor->handle($call);
    }
    return $dispatch;

  }

  /**
   * @param Call $call
   * @return mixed
   */
  abstract protected function handle(Call $call);


}