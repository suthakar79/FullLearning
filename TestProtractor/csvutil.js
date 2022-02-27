const papa=require('papaparse');
const excel=require('exceljs');
describe('csv parse using papaparse',function(){
    const fs=require('fs');
    xit('csv parse using papaparse',function(){
        const file=fs.readFileSync('./ESPP.csv','utf-8');
        let result=papa.parse(file,{
            header:true
        });
        console.log(result.data);
        console.log (result.meta);
             
        })

        it('read/write excel data using exceljs',function(){
          var  wb=new excel.Workbook();
          wb.xlsx.readFile('./exceldata.xlsx','utf-8').then(function(){
          var ws=wb.getWorksheet('Sheet1');
          console.log("actualRowcount : "+ws.actualRowCount+"  actual ColCount  :"+ws.actualColumnCount);
           for(i=0;i<=ws.actualRowCount;i++){
          for(j=0;j<=ws.actualColumnCount;j++)
          {            console.log(ws.getRow(i).getCell(j).value);
          }}
        ws.eachRow({includeEmpty:false},function(row,rownumber){
            console.log("ROW "+row);
            let currentRow=ws.getRow(rownumber)
            console.log("Row " + rowNumber + " = " + JSON.stringify(row.values));

        })
        //ws.getRow(6).getCell(1).value="sampleData";
    })
    
    // wb.xlsx.writeFile('./ESPP.xlsx').then(function(){
    //     console.log("Write successfull");
    // });
        })
    })
