let params = new URLSearchParams(window.location.search);
let id = params.get("id");
console.log(id);

const getCourse = id => {
    return arr.filter(c => c.id == id);
  };
  
  const course = getCourse(id);
  console.log(course);