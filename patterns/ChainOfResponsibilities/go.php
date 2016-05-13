<?php
require 'autoloader.php';

use Pattern\Call;
use Pattern\Director;
use Pattern\Manager;
use Pattern\Operator;

$call = new Call();

$chain = new Operator();
$chain->append(new Manager());
$chain->append(new Director());
$chain->dispatch($call);

$result = $call->getRequestQuantity();

$message = $result > 0 ? sprintf('Unable to handle all calls. Left %d',
  $result) : sprintf('Handled all calls, capacity left - %d', abs($result));

var_dump($message);