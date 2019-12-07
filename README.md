# SportHub (CentrumSportu)


<h2>Description</h2>
<p><i>SportHub</i> is a web based application providing an easy 24/7 access to a list of basic services offered by a gym network franchise to its <b>clients</b> and <b>staff</b>.</p>
<h3>Assumed app features</h3>
<p>The basic functionality set of the application covers the business service model specified as follows:</p>
<ol>
<li>The network operates several gym <b>hubs</b>.</li>
<li>The hubs may differ in their offers due to specifics of respective accommodation potential.</li>
<li>All hubs offer an essential set of services covering a basic <b>subscription</b> plan.</li>
<li>The basic subscription plan is a minimal offer, and includes a direct support from an assigned personal <b>trainer</b>.
<li>The basic sub plan may be extended with additional features incl. 
<ul>
<li>group <b>training</b> sessions <br>(e.g. yoga, swimming lessons, fitness groups etc.);</li>
<li>an access to specialized activity areas <br>(e.g.swimming pool, climbing wall, boxing ring etc.);</li>
<li>other services<br>(e.g. massaging and chiropractic care, dietary care etc.).</li>
</ul>
</li>
<li>Availability to some of the additional features (e.g. group trainings) is restricted by capacities of the respective locations (i.e. <b>schedule</b>, <b>room</b> size, available <b>equipment</b>, assigned trainers/supervisors etc.).<br> Customer may book an additional service, although due to the aforementioned limitations his/hers attendance in the activity of the choice will not be guaranteed.</li>
<li>The application is available to both customers and trainers respectively.</li>
<li>The application is maintained by admin (with full access to profiles and control over the database content).</li>
</ol>
<h2>Implementation</h2>
<p>The SportHub is designed using the MVC paradigm to utilize a PostgreSQL database hosted on an external server, and a cross-platform accessible GUI communicating via Apache Tomcat Server. For further cutting corners, and hopefully gaining some additional respect points, the project is developed in Spring framework.</p>
<p>The implementation of the app is based on a class structure pictured below.</p>
<img src="_docs\SportHubClassStructure.png" alt="UML class structure picture (png format).">
<p><br></p>
<p>The main database structure is shown below.<br></p>
<img src="_docs\SportHubDatabaseStructure.png" alt="UML table structure picture (png format).">


<h3>Versions</h3>
<ul>
<li><p></b><b>v 0.0.1</b></p>
<p>A basic class structure is now available including users and workout class groups as well as basic versions of repositories, services, controllers, and utils.</p>
</li>
</ul>


