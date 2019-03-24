<#import "parts/common.ftl" as e>

<@e.page>
<div align="center">
    <form method="post">
        <h2>STUFF STORE</h2><br>

        <input type="radio" name="type" value="Thing" style="display:inline-block;"> Thing<Br>
        <input type="radio" name="type" value="Case" style="display:inline-block;"> Case<Br>
        <p>
            <input type="text" name="wind" size="40" >
        </p>
        <input type="submit" value="Искать">
        <input type="radio" name="act" value="Name" style="display:inline-block;"> Name<Br>
        <input type="radio" name="act" value="inCase" style="display:inline-block;"> inCase<Br>
    </form>
</div>

<div>
    <form action="/addthing">
        <input type="submit" value="добавить штуки">
    </form>
</div>
<div>
    <form action="addcase">
        <input type="submit" value="добавить коробки">
    </form>
</div>
</@e.page>