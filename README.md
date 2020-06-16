# CoolToast
A really simple library that help you to display a custom toast with many colors (for : success, warning, danger, info, dark, light, primary...etc ), or with rounded corners, or even with image.

# Gradle
compile on your dependencies
<pre>
<code>
dependencies {
    compile 'com.ndroid.nadim:cool-toast:1.0'
}
</code>
</pre>

# ScreenShot
<img src="https://i.ibb.co/G5cQyhc/1-0-JHd38ud4r-WBn-NVknv-New.gif" alt="1-0-JHd38ud4r-WBn-NVknv-New" border="0">
# Sample Example
<a href="https://github.com/nadimgouia/CoolToast/tree/master/app">Sample Module</a>

# Usage

To create a new cool toast
<pre>
<code>
  CoolToast coolToast = new CoolToast(this);
  coolToast.make("Your first cool toast ! ");
</code>
</pre>

To set the style of your cool toast
<pre>
<code>
  //you have many style that you can use for your toast ( SUCCESS, DANGER, WARNING, INFO, PRIMARY, DARK, LIGHT)
  coolToast.make("That is a red cool toast ! ", CoolToast.DANGER);
  //or you can set the style with setStyle() method
  coolToast.setStyle(CoolToast.DANGER);
  coolToast.make("That is a red cool toast ! ");
</code>
</pre>

To set duration, position or make a rounded Toast 
<pre>
<code>
   //display the toast at the center of screen (you can use : CoolToast.LEFT, CoolToast.RIGHT, CoolToast.CENTER)
   coolToast.setPosition(CoolToast.CENTER);
   //make the corners round
   coolToast.setRounded(true); 
   //set the duration (it can be CoolToast.SHORT or CoolToast.LONG...)
   //By default it is : CoolToast.LONG
   coolToast.setDuration(CoolToast.SHORT); 
   coolToast.make("Info with image", CoolToast.INFO);
</code>
</pre>

Display a Cool Toast With Custom icon 
<pre>
<code>
  coolToast.setIcon(R.drawable.like);
  coolToast.make("Info with image", CoolToast.INFO, CoolToast.LONG);
</code>
</pre>




