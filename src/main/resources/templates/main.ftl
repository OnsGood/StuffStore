<#import "parts/common.ftl" as e>

<@e.page>
<div align="center">
    <form method="post">
        <h2>STUFF STORE</h2>
        <div class="container">
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" id="customRadioInline1" name="type" class="custom-control-input" value="Thing">
                <label class="custom-control-label" for="customRadioInline1">Thing</label>
            </div>
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" id="customRadioInline2" name="type" class="custom-control-input" value="Case">
                <label class="custom-control-label" for="customRadioInline2">Case</label>
            </div>

            <div class="input-group">
                <input name="wind" type="text" class="form-control" placeholder="Let's do it" aria-label="wind" aria-describedby="button-addon2">
                <div class="input-group-append">
                    <button class="btn btn-outline-secondary" type="submit" id="button-addon2">Search</button>
                </div>
            </div>
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" id="customRadioInline3" name="act" class="custom-control-input" value="Name">
                <label class="custom-control-label" for="customRadioInline3">by Name</label>
            </div>
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" id="customRadioInline4" name="act" class="custom-control-input" value="inCase">
                <label class="custom-control-label" for="customRadioInline4">by Case</label>
            </div>
        </div>
    </form>
</div>

</@e.page>