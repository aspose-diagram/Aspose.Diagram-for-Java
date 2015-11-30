<?php
namespace Aspose\Diagram\WorkingwithUserdefinedCells;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\User as User;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class CreateUserDefinedCell{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram=new Diagram($dataDir . "Drawing.vsd");

        $pages=$diagram->getPages();

        $i=0;
        while($i<(int)(string)$pages->getCount()) {
        $page = $pages->get($i);
        $shapes = $page->getShapes();
        $j = 0;
        while ($j<(int)(string)$shapes->getCount()) {
        $shape = $shapes->get($j);
        if ($shape->getNameU() == "Process") {
        # Initialize user object
        $user = new User();
        $user->setName("UserDefineCell");
        $user->getValue()->setVal("800");

        # Add user-defined cell
        $shape->getUsers()->add($user);
        }
        $j += 1;
        }
        $i += 1;
        }

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir . "UserDefinedCells.vdx", $saveFileFormat->VDX);
        print "Created User-defined Cell in the ShapeSheet.".PHP_EOL;
    }
}