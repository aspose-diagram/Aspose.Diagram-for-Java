<?php

require_once("../../java/Java.inc");

require_once __DIR__ . '/../vendor/autoload.php';  //Autoload files using Composer autoload

use Aspose\Diagram\LoadingSavingandConverting\CreatingaNewVisioDrawing;
use Aspose\Diagram\LoadingSavingandConverting\ExportToHtml;
use Aspose\Diagram\LoadingSavingandConverting\ExportToImage;
use Aspose\Diagram\LoadingSavingandConverting\ExportToPdf;
use Aspose\Diagram\LoadingSavingandConverting\ExportToSvg;
use Aspose\Diagram\LoadingSavingandConverting\ExportToXaml;
use Aspose\Diagram\LoadingSavingandConverting\ExportToXml;
use Aspose\Diagram\LoadingSavingandConverting\ExportToXps;
use Aspose\Diagram\LoadingSavingandConverting\OpenanExistingVisioDrawing;
use Aspose\Diagram\LoadingSavingandConverting\SavingVisioDocument;

use Aspose\Diagram\WorkingwithDiagrams\AddCommentToDiagram;
use Aspose\Diagram\WorkingwithDiagrams\CreateDiagram;
use Aspose\Diagram\WorkingwithDiagrams\GetConnectorsInfo;
use Aspose\Diagram\WorkingwithDiagrams\GetDiagramFontInfo;
use Aspose\Diagram\WorkingwithDiagrams\RemoveAllMacrosFromDiagram;

use Aspose\Diagram\WorkingwithHeadersandFooters\HeadersAndFooters;

use Aspose\Diagram\WorkingwithMasters\CheckPresenceOfMaster;
use Aspose\Diagram\WorkingwithMasters\GetMasterInfo;
use Aspose\Diagram\WorkingwithMasters\GetMasterObject;

use Aspose\Diagram\WorkingwithPages\AddPage;
use Aspose\Diagram\WorkingwithPages\GetPageInfo;
use Aspose\Diagram\WorkingwithPages\GetPageObject;

use Aspose\Diagram\WorkingwithShapes\ChangeShapePosition;
use Aspose\Diagram\WorkingwithShapes\ConnectSubShapes;
use Aspose\Diagram\WorkingwithShapes\ExtractImages;

use Aspose\Diagram\WorkingwithShapes\GetShapeInfo;
use Aspose\Diagram\WorkingwithShapes\ReadShapeData;
use Aspose\Diagram\WorkingwithShapes\ReplacePictureShape;
use Aspose\Diagram\WorkingwithShapes\RotateShape;
use Aspose\Diagram\WorkingwithShapes\SelectRerouteOption;
use Aspose\Diagram\WorkingwithShapes\SetMilestoneShapeProperties;
use Aspose\Diagram\WorkingwithShapes\SetShapeAppearance;
use Aspose\Diagram\WorkingwithShapes\SetShapeFillData;
use Aspose\Diagram\WorkingwithShapes\SetShapeHeightAndWidth;
use Aspose\Diagram\WorkingwithShapes\SetShapeLineData;
use Aspose\Diagram\WorkingwithShapes\SetShapeXFormData;

use Aspose\Diagram\WorkingwithSolutionXMLElements\AddSolutionXmlElement;
use Aspose\Diagram\WorkingwithSolutionXMLElements\ReadXmlValues;

use Aspose\Diagram\WorkingwithText\AddShapeTextAndStyles;
use Aspose\Diagram\WorkingwithText\ApplyCustomStyleSheet;
use Aspose\Diagram\WorkingwithText\UpdateShapeText;

use Aspose\Diagram\WorkingwithWindowElements\AddDynamicGridsAndConnectionPoints;
use Aspose\Diagram\WorkingwithWindowElements\AddWindowElement;
use Aspose\Diagram\WorkingwithWindowElements\GetWindowElements;
use Aspose\Diagram\WorkingwithWindowElements\ShowHideProperties;

use Aspose\Diagram\WorkingwithLayers\ConfigureShapeWithLayers;
use Aspose\Diagram\WorkingwithLayers\GetAllLayers;

use Aspose\Diagram\WorkingwithProtection\ProtectUnprotectDiagram;
use Aspose\Diagram\WorkingwithProtection\ProtectUnprotectShape;

use Aspose\Diagram\WorkingwithUserdefinedCells\CreateUserDefinedCell;
use Aspose\Diagram\WorkingwithUserdefinedCells\GetUserDefinedCells;
use Aspose\Diagram\WorkingwithUserdefinedCells\ReadUserDefinedCells;

use Aspose\Diagram\WorkingwithGeometrySection\ShapeGeometrySection;

use Aspose\Diagram\WorkingwithHyperlinks\AddHyperlinkToShape;
use Aspose\Diagram\WorkingwithHyperlinks\GetShapeHyperlinkData;

print "Running Aspose\\Diagram\\LoadingSavingandConverting\\CreatingaNewVisioDrawing::run()" . PHP_EOL;
CreatingaNewVisioDrawing::run(__DIR__ . '/data/LoadingSavingandConverting/CreatingaNewVisioDrawing/');

print "Running Aspose\\Diagram\\LoadingSavingandConverting\\ExportToHtml::run()" . PHP_EOL;
ExportToHtml::run(__DIR__ . '/data/LoadingSavingandConverting/ExportToHtml/');

print "Running Aspose\\Diagram\\LoadingSavingandConverting\\ExportToImage::run()" . PHP_EOL;
ExportToImage::run(__DIR__ . '/data/LoadingSavingandConverting/ExportToImage/');

print "Running Aspose\\Diagram\\LoadingSavingandConverting\\ExportToPdf::run()" . PHP_EOL;
ExportToPdf::run(__DIR__ . '/data/LoadingSavingandConverting/ExportToPdf/');

print "Running Aspose\\Diagram\\LoadingSavingandConverting\\ExportToSvg::run()" . PHP_EOL;
ExportToSvg::run(__DIR__ . '/data/LoadingSavingandConverting/ExportToSvg/');

print "Running Aspose\\Diagram\\LoadingSavingandConverting\\ExportToXaml::run()" . PHP_EOL;
ExportToXaml::run(__DIR__ . '/data/LoadingSavingandConverting/ExportToXaml/');

print "Running Aspose\\Diagram\\LoadingSavingandConverting\\ExportToXml::run()" . PHP_EOL;
ExportToXml::run(__DIR__ . '/data/LoadingSavingandConverting/ExportToXml/');

print "Running Aspose\\Diagram\\LoadingSavingandConverting\\ExportToXps::run()" . PHP_EOL;
ExportToXps::run(__DIR__ . '/data/LoadingSavingandConverting/ExportToXps/');

print "Running Aspose\\Diagram\\LoadingSavingandConverting\\OpenanExistingVisioDrawing::run()" . PHP_EOL;
OpenanExistingVisioDrawing::run(__DIR__ . '/data/LoadingSavingandConverting/OpenanExistingVisioDrawing/');

print "Running Aspose\\Diagram\\LoadingSavingandConverting\\SavingVisioDocument::run()" . PHP_EOL;
SavingVisioDocument::run(__DIR__ . '/data/LoadingSavingandConverting/SavingVisioDocument/');

print "Running Aspose\\Diagram\\WorkingwithDiagrams\\AddCommentToDiagram::run()" . PHP_EOL;
AddCommentToDiagram::run(__DIR__ . '/data/WorkingwithDiagrams/AddCommentToDiagram/');

print "Running Aspose\\Diagram\\WorkingwithDiagrams\\CreateDiagram::run()" . PHP_EOL;
CreateDiagram::run(__DIR__ . '/data/WorkingwithDiagrams/CreateDiagram/');

print "Running Aspose\\Diagram\\WorkingwithDiagrams\\GetConnectorsInfo::run()" . PHP_EOL;
GetConnectorsInfo::run(__DIR__ . '/data/WorkingwithDiagrams/GetConnectorsInfo/');

print "Running Aspose\\Diagram\\WorkingwithDiagrams\\GetDiagramFontInfo::run()" . PHP_EOL;
GetDiagramFontInfo::run(__DIR__ . '/data/WorkingwithDiagrams/GetDiagramFontInfo/');

print "Running Aspose\\Diagram\\WorkingwithDiagrams\\RemoveAllMacrosFromDiagram::run()" . PHP_EOL;
RemoveAllMacrosFromDiagram::run(__DIR__ . '/data/WorkingwithDiagrams/RemoveAllMacrosFromDiagram/');

print "Running Aspose\\Diagram\\WorkingwithHeadersandFooters\\HeadersAndFooters::run()" . PHP_EOL;
HeadersAndFooters::run(__DIR__ . '/data/WorkingwithHeadersandFooters/HeadersAndFooters/');

print "Running Aspose\\Diagram\\WorkingwithMasters\\CheckPresenceOfMaster::run()" . PHP_EOL;
CheckPresenceOfMaster::run(__DIR__ . '/data/WorkingwithMasters/CheckPresenceOfMaster/');

print "Running Aspose\\Diagram\\WorkingwithMasters\\GetMasterInfo::run()" . PHP_EOL;
GetMasterInfo::run(__DIR__ . '/data/WorkingwithMasters/GetMasterInfo/');

print "Running Aspose\\Diagram\\WorkingwithMasters\\GetMasterObject::run()" . PHP_EOL;
GetMasterObject::run(__DIR__ . '/data/WorkingwithMasters/GetMasterObject/');

print "Running Aspose\\Diagram\\WorkingwithPages\\AddPage::run()" . PHP_EOL;
AddPage::run(__DIR__ . '/data/WorkingwithPages/AddPage/');

print "Running Aspose\\Diagram\\WorkingwithPages\\GetPageInfo::run()" . PHP_EOL;
GetPageInfo::run(__DIR__ . '/data/WorkingwithPages/GetPageInfo/');

print "Running Aspose\\Diagram\\WorkingwithPages\\GetPageObject::run()" . PHP_EOL;
GetPageObject::run(__DIR__ . '/data/WorkingwithPages/GetPageObject/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\ChangeShapePosition::run()" . PHP_EOL;
ChangeShapePosition::run(__DIR__ . '/data/WorkingwithShapes/ChangeShapePosition/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\ConnectSubShapes::run()" . PHP_EOL;
ConnectSubShapes::run(__DIR__ . '/data/WorkingwithShapes/ConnectSubShapes/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\ExtractImages::run()" . PHP_EOL;
ExtractImages::run(__DIR__ . '/data/WorkingwithShapes/ExtractImages/');


print "Running Aspose\\Diagram\\WorkingwithShapes\\GetShapeInfo::run()" . PHP_EOL;
GetShapeInfo::run(__DIR__ . '/data/WorkingwithShapes/GetShapeInfo/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\ReadShapeData::run()" . PHP_EOL;
ReadShapeData::run(__DIR__ . '/data/WorkingwithShapes/ReadShapeData/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\ReplacePictureShape::run()" . PHP_EOL;
ReplacePictureShape::run(__DIR__ . '/data/WorkingwithShapes/ReplacePictureShape/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\RotateShape::run()" . PHP_EOL;
RotateShape::run(__DIR__ . '/data/WorkingwithShapes/RotateShape/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\SelectRerouteOption::run()" . PHP_EOL;
SelectRerouteOption::run(__DIR__ . '/data/WorkingwithShapes/SelectRerouteOption/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\SetMilestoneShapeProperties::run()" . PHP_EOL;
SetMilestoneShapeProperties::run(__DIR__ . '/data/WorkingwithShapes/SetMilestoneShapeProperties/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\SetShapeAppearance::run()" . PHP_EOL;
SetShapeAppearance::run(__DIR__ . '/data/WorkingwithShapes/SetShapeAppearance/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\SetShapeFillData::run()" . PHP_EOL;
SetShapeFillData::run(__DIR__ . '/data/WorkingwithShapes/SetShapeFillData/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\SetShapeHeightAndWidth::run()" . PHP_EOL;
SetShapeHeightAndWidth::run(__DIR__ . '/data/WorkingwithShapes/SetShapeHeightAndWidth/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\SetShapeLineData::run()" . PHP_EOL;
SetShapeLineData::run(__DIR__ . '/data/WorkingwithShapes/SetShapeLineData/');

print "Running Aspose\\Diagram\\WorkingwithShapes\\SetShapeXFormData::run()" . PHP_EOL;
SetShapeXFormData::run(__DIR__ . '/data/WorkingwithShapes/SetShapeXFormData/');

print "Running Aspose\\Diagram\\WorkingwithSolutionXMLElements\\AddSolutionXmlElement::run()" . PHP_EOL;
AddSolutionXmlElement::run(__DIR__ . '/data/WorkingwithSolutionXMLElements/AddSolutionXmlElement/');

print "Running Aspose\\Diagram\\WorkingwithSolutionXMLElements\\ReadXmlValues::run()" . PHP_EOL;
ReadXmlValues::run(__DIR__ . '/data/WorkingwithSolutionXMLElements/ReadXmlValues/');

print "Running Aspose\\Diagram\\WorkingwithText\\AddShapeTextAndStyles::run()" . PHP_EOL;
AddShapeTextAndStyles::run(__DIR__ . '/data/WorkingwithText/AddShapeTextAndStyles/');

print "Running Aspose\\Diagram\\WorkingwithText\\ApplyCustomStyleSheet::run()" . PHP_EOL;
ApplyCustomStyleSheet::run(__DIR__ . '/data/WorkingwithText/ApplyCustomStyleSheet/');

print "Running Aspose\\Diagram\\WorkingwithText\\UpdateShapeText::run()" . PHP_EOL;
UpdateShapeText::run(__DIR__ . '/data/WorkingwithText/UpdateShapeText/');

print "Running Aspose\\Diagram\\WorkingwithWindowElements\\AddDynamicGridsAndConnectionPoints::run()" . PHP_EOL;
AddDynamicGridsAndConnectionPoints::run(__DIR__ . '/data/WorkingwithWindowElements/AddDynamicGridsAndConnectionPoints/');

print "Running Aspose\\Diagram\\WorkingwithWindowElements\\AddWindowElement::run()" . PHP_EOL;
AddWindowElement::run(__DIR__ . '/data/WorkingwithWindowElements/AddWindowElement/');

print "Running Aspose\\Diagram\\WorkingwithWindowElements\\GetWindowElements::run()" . PHP_EOL;
GetWindowElements::run(__DIR__ . '/data/WorkingwithWindowElements/GetWindowElements/');

print "Running Aspose\\Diagram\\WorkingwithWindowElements\\ShowHideProperties::run()" . PHP_EOL;
ShowHideProperties::run(__DIR__ . '/data/WorkingwithWindowElements/ShowHideProperties/');


print "Running Aspose\\Diagram\\WorkingwithLayers\\ConfigureShapeWithLayers::run()" . PHP_EOL;
ConfigureShapeWithLayers::run(__DIR__ . '/data/WorkingwithLayers/ConfigureShapeWithLayers/');

print "Running Aspose\\Diagram\\WorkingwithLayers\\GetAllLayers::run()" . PHP_EOL;
GetAllLayers::run(__DIR__ . '/data/WorkingwithLayers/GetAllLayers/');

print "Running Aspose\\Diagram\\WorkingwithProtection\\ProtectUnprotectDiagram::run()" . PHP_EOL;
ProtectUnprotectDiagram::run(__DIR__ . '/data/WorkingwithProtection/ProtectUnprotectDiagram/');

print "Running Aspose\\Diagram\\WorkingwithProtection\\ProtectUnprotectShape::run()" . PHP_EOL;
ProtectUnprotectShape::run(__DIR__ . '/data/WorkingwithProtection/ProtectUnprotectShape/');

print "Running Aspose\\Diagram\\WorkingwithUserdefinedCells\\CreateUserDefinedCell::run()" . PHP_EOL;
CreateUserDefinedCell::run(__DIR__ . '/data/WorkingwithUserdefinedCells/CreateUserDefinedCell/');

print "Running Aspose\\Diagram\\WorkingwithUserdefinedCells\\GetUserDefinedCells::run()" . PHP_EOL;
GetUserDefinedCells::run(__DIR__ . '/data/WorkingwithUserdefinedCells/GetUserDefinedCells/');

print "Running Aspose\\Diagram\\WorkingwithUserdefinedCells\\ReadUserDefinedCells::run()" . PHP_EOL;
ReadUserDefinedCells::run(__DIR__ . '/data/WorkingwithUserdefinedCells/ReadUserDefinedCells/');

print "Running Aspose\\Diagram\\WorkingwithGeometrySection\\ShapeGeometrySection::run()" . PHP_EOL;
ShapeGeometrySection::run(__DIR__ . '/data/WorkingwithGeometrySection/ShapeGeometrySection/');

print "Running Aspose\\Diagram\\WorkingwithHyperlinks\\AddHyperlinkToShape::run()" . PHP_EOL;
AddHyperlinkToShape::run(__DIR__ . '/data/WorkingwithHyperlinks/AddHyperlinkToShape/');

print "Running Aspose\\Diagram\\WorkingwithHyperlinks\\GetShapeHyperlinkData::run()" . PHP_EOL;
GetShapeHyperlinkData::run(__DIR__ . '/data/WorkingwithHyperlinks/GetShapeHyperlinkData/');