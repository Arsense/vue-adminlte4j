<template>
    <div  class="tab-pane" :id="tab_id">
        <slot></slot>
    </div>
</template>
<script>
export default {
    name:'v-tab-pane',
    props:{
        label : String ,
        active: {type:Boolean, default:false} ,
        dynamic: {type:Boolean, default:false}
    } ,
    computed: {
        tab_id(){
            return "tab_" + unique_id()
        }
    },
    mounted: function () {
        if(!this.dynamic)
            this.$parent.addChildPane(this)
    }
}
</script>