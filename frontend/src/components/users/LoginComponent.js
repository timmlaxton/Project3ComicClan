import React from 'react';
import {Link} from 'react-router-dom';

const LoginComponent = (props) => {
  const options = this.state.users.map( (user, index ) => {
    return <option value={index} key={index}>{user.name}</option>
  })

  const homepageUrl = "/"

    function handleChange(event){
      props.handleUserSelect(event.target.value)
    }

  return (
    <div className="login">
      <h1>Welcome to Comic Clan!</h1>

        <select
        id="country-selector"
        defaultValue="default"
        onchange={handleChange}
        >
          <option value="" disabled>Please select your user name:</option>
          {this.options}
        </select>
        <br />
      <Link to={homepageUrl}><button type="button">Enter</button></Link>
    </div>
  );

}

export default LoginComponent;
