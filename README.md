# cfc-co-aid
co-aid is application for providing assistance to residents, service providers, govt officials and volunteers during covid-19 crisis. 
<p>
  <div>https://youtu.be/4gT3QZyRcVs</div>
  <p><a href="https://youtu.be/4gT3QZyRcVs" rel="nofollow"><img src="co_aid_youtube_video_icon.PNG" alt="Watch the video" style="max-width:100%;"></a></p>
</p>
<p>
<b><h2>Problem Statement</h2></b> <br>
<br>
<b>Supplies for essential services in ‘Containment Zones’</b>
<br><ul>
<li>With the COVID-19 crisis, we have already seen problems with the local supply of grocery items, medicines and other supplies during lock-down especially for elderly and other vulnerable people.
With increasing containments zones the challenges are also increasing for communities as-
<ul>
<li><b>NOT every local vendor has online presence</b></li>
<li><b>NOT every volunteer is provided with means to serve</b> </li>
<li><b>NOT everyone is indepedent and well-equipped</b></li>
</ul>
</li>

<li>The restrictions imposed by local authorities, the recommended (or required) self-isolation and social distancing measures can compound the problem by preventing people from easily getting to locations with the best stocks of local supplies.</li>

<li>The Volunteers working in local communities are not usually updated with who needs what, where ? They may have will to help and provide voluntary services to people but generally lack the platform which can assist them in effective collaborative way of service.</li>
</ul>
<br>
<b>Preliminary Assistance & Quick Reporting for suspected Covid-19 cases in an area</b>
<br><ul>
<li>Another challenge people face is about getting preliminary medical advice/support in case if someone is showing mild to moderate or few of the Covid -19 related symptoms. The helpline numbers are usually flooded and its not advisable to show up/visit nearby hospital in this situation unless its not really a confirmed/suspected case.</li>

<li>RRT team members/ health workers working in field who have been asked to do door to door surveys for identifying cases and providing guidance in such scenarios can help here. But people are struggling to contact right individuals (health workers, Medical Supervisors) working in given area, get right advice, local information related to testing or precautionary measures in general on their own.</li>

<li>The limited resources (RRT members/staff, tools) sometimes delay the data collection via door to door surveys and reporting which can delay further decision making such as (zone declarations, imposing certain restrictions or medical support availability)</li>

<li>Not everyone is having quick access to Map views identifying zones with covid-19 cases in given locality</li>
</ul>

</p>
<p>
<b><h2>Idea</h2></b><br> 
It basically connects residents locked-down in containment zones or covid hotspots, local service providers for essential goods and services, local volunteers approved by authorities/govt and health workers/Rapid Response Team (RRT) team members.


<br><br>
<b><h2>Flow</h2></b><br>

1. Using AI based virtual assistant users can find or locate available vendors in nearby area and place the orders for essential supplies. AI based bot will also help them locate covid test centers, locally available health/RRT team members and volunteers for any assistance.
2. The service Providers even those who dont have any e-commerse sites/online presence for their business can be part of this. They will recieve requests submitted on bot and they can process the requested orders; get the supplies ready for delivery by updating order status with bill.
3. The application will support workflows where service providers can further assign the order to locally available and approved (having e-pass to serve in containment/hotspot zones) Volunteer for delivery 
4. The volunteer can then collect the supply items from service provider's shop in assigned time slot and will deliver the items to requester by using location routing services.
5. The users/resident can also contact Health Workers/RRT members who are doing surveys in an area and if there is any suspected case based on preliminary evaluation the Health Worker will report the case using app.
6. This on field data capturing and quick reporting will help to compile data related to covid cases in in speedy way and accelerate further decision making
7. The data gathered can also help to present mapviews for covid containment zones/ hotspot zones in app for users

<br><br>
<b><h2>Why Co-Aid is better ? because it helps - </h2></b> 
<br>
<b>1. connecting local service providers even without any e-commerce site/ online presence which will help save their business during this crisis and even after crisis period ends</b>

<b>2. Volunteers to be easily accessible and to serve even through simple activities such as supply deliveries and assitance for vulnerables</b>

<b>3. on field data capturing and reporting about covid cases by Health Workers/RRT Members for decision making</b>
<br>
<br>
<p>
<b><h2>Use Case Scenarios & working chatbot Screens for reference</h2></b><br></p>
<img src="/key_use_cases/chatbot.png">
<img src="/key_use_cases/bot_service_order.png">
<img src="/key_use_cases/service_provider_receives_order.png">
<img src="/key_use_cases/volunteer_1.png">
<img src="/key_use_cases/covid_case_identification_report.png">
<br>
<i><b> For chatbot screenshots please refer screenshots folder uploaded in this repoistory<b></i>


<br>

<p>
<b><h2>Solution Overview</h2></b><br></p>
<img src="/co_aid_solution_overview.png">  
<br>
<br>
<img src="/co_aid_solution_approach.png">  


<p>
<b><h2>High Level Architecture</h2></b><br></p>
<img src="/co_aid_high_level_architecture.png">


<br>
<b><h2>Technology Used</h2></b> 
<br>
Co-Aid Application builds an ecosystem/network with combined use of IBM service offerings and some other technologies available today and provides a technical solution we are looking for –
<ul>
<li>IBM Watson (AI Platform) – for deploying cognitive virtual assistant i.e. ChatBot to interact with residents</li>
<li>IBM Cloud Functions – IBM’s Function as a Service Platform based on Apache OpenWhisk</li>
<li>IBM Cloudant – A distributed database based on Apache CouchDB for storing documents etc.</li>
<li>IBM Speech to Text and Text to Speech Services to convert audio and voice into text and vice versa.</li>
<li>IBM Cloud Platform for providing high availability, more security and scalability for this ecosystem</li>
<li>Node.js</li>
<li>IBM Push Notifications – for providing scalable and reliable Push Notification Services to users</li>
<li>IBM Mobile Foundation – for building mobile app</li>
<li>HERE Location Services -  for maps, searching, and routing</li>
</ul>
</p>




