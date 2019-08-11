import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import LoginComponent from '../../components/users/LoginComponent.js'

class LoginPage extends Component {
  constructor(props){
    super(props);
    this.state = {
      users: [],
      currentUser: null
    }
    this.handleUserSelect = this.handleUserSelect.bind(this)
  }

  render(){
    const homepageUrl = "/"

    function handleUserChosen(event){
      event.preventDefault();

    }

    function handleChange(event){
      this.handleUserSelect(event.target.value)
    }

    const options = this.state.users.map( (user, index ) => {
      return <option value={index} key={index}>{user.name}</option>
    })
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

}

export default LoginPage;
