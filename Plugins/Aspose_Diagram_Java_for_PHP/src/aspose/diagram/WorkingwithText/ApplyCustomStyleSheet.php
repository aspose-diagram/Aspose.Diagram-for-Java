<?php
namespace Aspose\Diagram\WorkingwithText;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\Txt as Txt;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ApplyCustomStyleSheet{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        $shapes =$diagram->getPages()->getPage(0)->getShapes();

        $i=0;
        while ($i<(int)(string)$shapes->getCount()) {
        $shape=$shapes->get($i);
        if($shape->getNameU()=="Process") {
        $source_shape =$shape;
        break;
        }
        $i+= 1;
        }

        # Find the required style sheet
        $stylesheets=$diagram->getStyleSheets();
        $j=0;
        while($j<(int)(string)$stylesheets->getCount()) {
        $stylesheet=$stylesheets->get($j);
        if($stylesheet->getName() == "Basic") {
        $custom_stylesheet = $stylesheet;
        break;
        }
        $j+= 1;
        }

        if ($source_shape!=null && $custom_stylesheet !=null) {
        # Apply text style
        $source_shape->setTextStyle($custom_stylesheet);
        # Apply fill style
        $source_shape->setFillStyle($custom_stylesheet);
        # Apply line style
        $source_shape->setLineStyle($custom_stylesheet);
        }

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."ApplyCustomStyleSheet.vdx", $saveFileFormat->VDX);

        print "Applied custom stylesheet to a visio diagram.".PHP_EOL;
    }
}