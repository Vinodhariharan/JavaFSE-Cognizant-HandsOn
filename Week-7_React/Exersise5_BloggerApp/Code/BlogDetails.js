
function BlogDetails({ posts }) {
  return (
    <div>
      <h1>Blog Details</h1>
      {posts.map(post => (
        <div key={post.id}>
          <h2>{post.title}</h2>
          <h3>{post.author}</h3>
          <p>{post.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;