<?php

$a = array("red"=>"b","blue"=>"d","green"=>"c","yellow"=>"a");
ksort($a);

foreach($a as $key => $value){
    echo $key.":".$value."<br>";
}
?>