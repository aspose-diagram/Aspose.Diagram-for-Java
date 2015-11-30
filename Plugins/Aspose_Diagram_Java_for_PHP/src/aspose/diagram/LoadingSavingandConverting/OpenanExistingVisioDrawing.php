<?php
namespace Aspose\Diagram\LoadingSavingandConverting;

use com\aspose\diagram\Diagram as Diagram;
class OpenanExistingVisioDrawing{

    public static function run($dataDir=null){

        $diagram = new Diagram($dataDir . "Drawing.vsd");
    }

}