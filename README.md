# Chain_Of_Responsibility-Pattern

<b>Benefits of the chain of responsibility pattern:</b>
<li>
Decouples the sender and receivers of the request.
</li>
<li>
Simplifies our object because it doesn't have to know the chain’s structure and keep direct references to its members.
</li>
<li>
Allows us to add or remove responsibilities dynamically by changing the members or order of the chain.
</li>


<b>Drawbacks of the chain of responsibility pattern:</b>

<li>Execution of the request isn’t guaranteed; it may fall off the end of the chain if no object handles it.</li>
<li>It can be hard to observe and debug the runtime characteristics. </li>
