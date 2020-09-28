function imageChange(event){
	if(event.target.tagName = "IMG"){
		document.getElementById('mainImage').src = event.target.src;
	}
	
}