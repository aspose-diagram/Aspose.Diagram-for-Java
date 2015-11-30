<?php
namespace Aspose\Diagram\LoadingSavingandConverting;

use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
use com\aspose\diagram\Diagram as Diagram;
class SavingVisioDocument{

    public static function run($dataDir=null){
        $saveFileFormat=new SaveFileFormat();
        $diagram=new Diagram();
        $diagram->save($dataDir."Diagram.vdx", $saveFileFormat->VDX);
    }
}