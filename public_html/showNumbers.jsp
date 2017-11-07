<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
  <title>Justin Laabs</title>
  <meta name="description" content="free website template" />
  <meta name="keywords" content="enter your keywords here" />
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=9" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script type="text/javascript" src="js/image_slide.js"></script>
</head>

<body>
  <div id="main">
    <div id="header">
	  <div id="banner">
	    <div id="welcome">
	      <h1>Welcome To PowerBall Custom</h1><h3>By Justin Laabs</h3>
	    </div><!--close welcome-->
	    <div id="menubar">
          <ul id="menu">
            <li class="current"><a href="/java112">Home</a></li>
            
          </ul>
        </div><!--close menubar-->	  
	  </div><!--close banner-->	
    </div><!--close header-->	
    
	<div id="site_content">		

      <div class="slideshow">  
		<ul class="slideshow">
          <li class="show"><img width="900" height="350" src="images/home_1.jpg" alt="&quot;We love Java!&quot;" /></li>
          <li><img width="900" height="350" src="images/Java.jpg" alt="&quot;Seriously, we love it.&quot;" /></li>
        </ul> 
      </div><!--close slideshow-->		
	 
	  <div id="content">
        <div class="content_item">
		  <h1>PowerBall Custom!!!</h1> 
          <p>Here are your PowerBall Numbers!</p>			  
		</div><!--close content_item-->
      </div><!--close content-->   
	  
	  <div class="container">

	    <div class="testimonials">
			<ul>
                <li>Winning Numbers: ${myPowerballBean.getWinningNumbers()}</li>
                <li>Powerball Number: ${myPowerballBean.getPowerballNumber()}</li>
                <li>Lucky Number: ${myPowerballBean.getLuckyNumber()}</li>
                <li>Unlucky Number: ${myPowerballBean.getUnluckyNumber()}</li>
		    </ul>
            <table>
                <tr>
                    <th>Past Numbers</th>
                    <th>Powerball Number</th>
                    <th>Lucky Number</th>
                    <th>Unlucky Number</th>
                </tr>
                ${myPowerballBeanList}
            </table>            
	    </div><!--close testimonials-->	  

	  </div><!--close container-->
	
	</div><!--close site_content--> 
  
 
  </div><!--close main-->
  
  <div id="footer_container">
    <div id="footer">
	  <a href="http://validator.w3.org/check?uri=referer">Valid XHTML</a> | <a href="http://fotogrph.com/">Images</a> | Heart Internet <a href="http://www.heartinternet.co.uk/web-hosting/">web hosting</a> | website template by <a href="http://www.araynordesign.co.uk">ARaynorDesign</a>
    </div><!--close footer-->  
  </div><!--close footer_container-->  
  
</body>
</html>