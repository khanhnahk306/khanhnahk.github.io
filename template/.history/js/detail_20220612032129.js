let params = new URLSearchParams(window.location.search);
let id = params.get("id");
console.log(id);

const Course = (id, arr) => {
    return arr.filter((c) => c.id == id)[0];
  };
  
  const course = getCourse(id, courses);
  console.log(course);