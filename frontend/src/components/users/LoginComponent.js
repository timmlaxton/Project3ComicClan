import React from 'react';
import {Link} from 'react-router-dom';

const LoginComponent = (props) => {
  const options = props.users.map( (user, index ) => {
    return <option value={index} key={index}>{user.name}</option>
  })

  const homepageUrl = "/"

  const handleSubmit = (event) => {
      console.log(event.target.user.value);
      event.preventDefault();
      const user = props.users[event.target.user.value]
      props.onUserSelected(user)
      console.log(user);
    }

  return (
    <div className="login">
      <h1>Welcome to Comic Clan!</h1>

        <form onSubmit={handleSubmit}>
          <select name="user">
            {options}
          </select>
          <button type="submit">Login!</button>
        </form>
    </div>
  );

}

export default LoginComponent;
