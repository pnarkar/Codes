<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Assignment03 Part05</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css" type="text/css"/>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    </head>

    <body>
        <div class="panel panel-default ">
              <div class="panel-heading">
                <h2 class="panel-title">Sales order data :</h2>
              </div>
              <div class="panel-body">
                  <h4>Below is the data from the Sales Order table.</h4>
                      <form name="choice-form" action="fetchData.htm?action=display&page=1&records=10" method="post">
                      <div class="col-sm-4 col-md-4 col-lg-4">
                             <input type="text" class="form-control" name="choice"  id="path-of-csv" required placeholder="Enter a file name">
                      </div>
                      <div class="col-sm-8 col-md-8 col-lg-8">
                          <input class="btn btn-primary" type="submit" id="submit-btn" value="Send">
                      </div>
                      </form>
              </div>
        </div>
    </body>
</html>
